package spring.aop.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class LoggingAspect {
	
//	@Before("allCircleMethods()")
//	public void loggingAdvice(JoinPoint jp){
//		System.out.println(jp.toString());
//	}
	
	/*@Before("allGetters()")
	public void secondloggingAdvice(){
		System.out.println("Second Advice Executed.");
	}*/
	
//	@After("args(name)")
//	public void stringArgumentsMethods(String name){
//		System.out.println("Method with Stiring arguments is called ="+name);
//	}
//	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringAfterReturnAdvice(String name, String returnString ){
		System.out.println("Method with String argument is called,  value is ="+name +" Return Value is "+returnString);
	}
	
	//@Around("@annotation(spring.aop.test.aspect.Loggable)")
	public Object aroundAdvice(ProceedingJoinPoint pjp){
		Object returnObj = null;
		try {
			System.out.println("Running Before Advice");
			returnObj = pjp.proceed();
			System.out.println("Running After Returning");
		} catch (Throwable e) {
			System.out.println("Running After Throwing Advice");
		}
		
		System.out.println("Running After Finally");
		return returnObj;
	}
	
/*	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void afterThrowingAdvice(String name, String ex ){
		System.out.println("Exception Thrown is :"+ex);
	}*/
	
/*	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	
	@Pointcut("execution(* * spring.aop.test.model.Circle.*(..))")
	public void allCircleMethods(){}
	
	@Pointcut("within(spring.aop.test.model.Circle)")
	public void allCircleMethods(){}*/
	
}
