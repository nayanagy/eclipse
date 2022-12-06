package com.xworkz.exception;

import java.awt.AWTError;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.awt.print.PrinterAbortException;
import java.beans.PropertyVetoException;
import java.io.NotActiveException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URISyntaxException;
import java.net.UnknownServiceException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.rmi.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.ProviderException;
import java.text.ParseException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingFormatArgumentException;
import java.util.TooManyListenersException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.zip.DataFormatException;

import javax.lang.model.element.UnknownAnnotationValueException;
import javax.lang.model.type.MirroredTypeException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMRuntimeException;
import javax.script.ScriptException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPathException;

import org.ietf.jgss.GSSException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class Event {

	public void method1() {
		System.out.println("Running method1");
		throw new RuntimeException();
	}

	public void method2() {
		System.out.println("Running method2");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void method3() {
		System.out.println("Running method3");
		throw new ArithmeticException();
	}

	public void method4() {
		System.out.println("Running method4");
		throw new ArrayStoreException();
	}

	public void method5() {
		System.out.println("Running method5");
		throw new BufferOverflowException();
	}

	public void method6() {
		System.out.println("Running method6");
		throw new BufferUnderflowException();
	}

	public void method7() {
		System.out.println("Running method7");
		throw new CannotRedoException();
	}

	public void method8() {
		System.out.println("Running method8");
		throw new CannotUndoException();
	}

	public void method9() {
		System.out.println("Running method9");
		throw new ClassCastException();
	}

	public void method10() {
		System.out.println("Running method10");
		throw new CMMException(null);
	}

	public void method11() {
		System.out.println("Running method11");
		throw new ConcurrentModificationException();
	}

	public void method12() {
		System.out.println("Running method12");
		throw new EmptyStackException();
	}

	public void method13() {
		System.out.println("Running method13");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void method14() {
		System.out.println("Running method14");
		throw new FileSystemAlreadyExistsException();
	}

	public void method15() {
		System.out.println("Running method15");
		throw new FileSystemNotFoundException();
	}

	public void method16() {
		System.out.println("Running method16");
		throw new IllegalArgumentException();
	}

	public void method17() {
		System.out.println("Running method17");
		throw new IllegalMonitorStateException();
	}

	public void method18() {
		System.out.println("Running method18");
		throw new IllegalPathStateException();
	}

	public void method19() {
		System.out.println("Running method19");
		throw new ImagingOpException(null);
	}

	public void method20() {
		System.out.println("Running method20");
		throw new IncompleteAnnotationException(null, null);
	}

	public void method21() {
		System.out.println("Running method21");
		throw new IndexOutOfBoundsException()
	}

	public void method22() {
		System.out.println("Running method22");
		throw new JMRuntimeException();
	}

	public void method23() {
		System.out.println("Running method23");
		throw new JMRuntimeException(null);
	}

	public void method24() {
		System.out.println("Running method24");
		throw new LSException((short) 0, null);
	}

	public void method25() {
		System.out.println("Running method25");
		throw new MalformedParameterizedTypeException();
	}

	public void method26() {
		System.out.println("Running method26");
		throw new MirroredTypeException(null);
	}

	public void method27() {
		System.out.println("Running method27");
		throw new MissingFormatArgumentException(null);
	}

	public void method28() {
		System.out.println("Running method28");
		throw new NegativeArraySizeException();
	}

	public void method29() {
		System.out.println("Running method29");
		throw new RejectedExecutionException();
	}

	public void method30() {
		System.out.println("Running method30");
		throw new NoSuchMechanismException();
	}

	public void method31() {
		System.out.println("Running method31");
		throw new ProfileDataException(null);
	}

	public void method32() {
		System.out.println("Running method32");
		throw new ProviderException();
	}

	public void method33() {
		System.out.println("Running method33");
		throw new TypeNotPresentException(null, null);
	}

	public void method34() {
		System.out.println("Running method34");
		throw new UndeclaredThrowableException(null);
	}

	public void method35() {
		System.out.println("Running method35");
		throw new UnknownAnnotationValueException(null, getClass());
	}

	public void method36() throws Exception {
		System.out.println("running method36");
		throw new Exception();
	}

	public void method37() throws AciNotFoundException {
		System.out.println("running method36");
		throw new AciNotFoundException();
	}

	public void method38() throws ActivationException {
		System.out.println("running method38");
		throw new ActivationException();
	}

	public void method39() throws AlreadyBoundException {
		System.out.println("running method39");
		throw new AlreadyBoundException();
	}

	public void method40() throws InvalidApplicationException {
		System.out.println("running method40");
		throw new InvalidApplicationException(getClass());
	}

	public void method41() throws BadBinaryOpValueExpException {
		System.out.println("running method41");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method42() throws BadLocationException {
		System.out.println("running method42");
		throw new BadLocationException(null, 0);
	}

	public void method43() throws BadStringOperationException {
		System.out.println("running method43");
		throw new BadStringOperationException(null);
	}

	public void method44() throws BadBinaryOpValueExpException {
		System.out.println("running method44");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method45() throws BadLocationException {
		System.out.println("running method45");
		throw new BadLocationException(null, 0);
	}

	public void method46() throws DestroyFailedException {
		System.out.println("running method46");
		throw new DestroyFailedException();
	}

	public void method47() throws GeneralSecurityException {
		System.out.println("running method47");
		throw new GeneralSecurityException();
	}

	public void method48() throws DestroyFailedException {
		System.out.println("running method48");
		throw new DestroyFailedException();
	}

	public void method49() throws ExecutionException {
		System.out.println("running method49");
		throw new ExecutionException(null);
	}

	public void method50() throws FontFormatException {
		System.out.println("running method50");
		throw new FontFormatException(null);
	}

	public void method51() throws InvalidMidiDataException {
		System.out.println("running method51");
		throw new InvalidMidiDataException();
	}

	public void method52() throws InvalidBadStringOperationException {
		System.out.println("running method52");
		throw new InvalidBadStringOperationException();
	}

	public void method53() throws GeneralSecurityException {
		System.out.println("running method53");
		throw new GeneralSecurityException();
	}

	public void method54() throws GSSException {
		System.out.println("running method54");
		throw new GSSException(0);
	}

	public void method55() throws IllegalClassFormatException {
		System.out.println("running method55");
		throw new IllegalClassFormatException();
	}

	public void method56() throws UnknownServiceException {
		System.out.println("running method 56");
		throw new UnknownServiceException();
	}

	public void method57() throws UserPrincipalNotFoundException {
		System.out.println("running method 57");
		throw new UserPrincipalNotFoundException(null);
	}

	public void method58() throws URISyntaxException {
		System.out.println("running method 58");
		throw new URISyntaxException(null, null);
	}

	public void method59() throws URIReferenceException {
		System.out.println("running method 59");
		throw new URIReferenceException();
	}

	public void method60() throws PrivilegedActionException {
		System.out.println("running method 60");
		throw new PrivilegedActionException(null);
	}

	public void method61() throws PropertyVetoException {
		System.out.println("running method 61");
		throw new PropertyVetoException(null, null);
	}

	public void method62() throws MarshalException {
		System.out.println("running method 62");
		throw new MarshalException();
	}

	public void method63() throws NotActiveException {
		System.out.println("running method 63");
		throw new NotActiveException();
	}

	public void method64() throws NotActiveException {
		System.out.println("running method 64");
		throw new NotActiveException(null);
	}

	public void method65() throws LineUnavailableException {
		System.out.println("running method 65");
		throw new LineUnavailableException();
	}

	public void method66() throws ParseException {
		System.out.println("running method 66");
		throw new ParseException(null, 0);
	}

	public void method67() throws ParserConfigurationException {
		System.out.println("running method 67");
		throw new ParserConfigurationException(null);
	}

	public void method68() throws PrinterAbortException {
		System.out.println("running method 68");
		throw new PrinterAbortException();
	}

	public void method69() throws TransformerConfigurationException {
		System.out.println("running method 69");
		throw new TransformerConfigurationException();
	}

	public void method70() throws TooManyListenersException {
		System.out.println("running method ");
		throw new TooManyListenersException();
	}

	// error exception

	public void method71() {
		System.out.println("running method 71");
		throw new Error();
	}

	public void method72() {
		System.out.println("running method 72");
		throw new AssertionError();
	}

	public void method73() {
		System.out.println("running method 73");
		throw new AssertionError(false);
	}

	public void method74() {
		System.out.println("running method 74");
		throw new AssertionError(0);
	}

	public void method75() {
		System.out.println("running method 75");
		throw new AssertionError(0);
	}

	public void method76() {
		System.out.println("running method 76");
		throw new AWTError(null);
	}

	public void method77() {
		System.out.println("running method 77");
		throw new CoderMalfunctionError(null);
	}

	public void method78() {
		System.out.println("running method 78");
		throw new FactoryConfigurationError();
	}

	public void method79() {
		System.out.println("running method 79");
		throw new TransformerFactoryConfigurationError(null, null);
	}

	public void method80() {
		System.out.println("running method 80");
		throw new VirtualMachineError() {
		};
	}

	public void method81() {
		System.out.println("running method 81");
		throw new InternalError();
	}

	public void method82() {
		System.out.println("running method 82");
		throw new OutOfMemoryError();
	}

	public void method83() {
		System.out.println("running method 83");
		throw new StackOverflowError();
	}

	public void method84() {
		System.out.println("running method 84");
		throw new UnknownError();
	}

	public void method85() {
		System.out.println("running method 85");
		throw new ClassCircularityError();
	}

	public void method86() {
		System.out.println("running method 86");
		throw new ExceptionInInitializerError();
	}

	public void method87() {
		System.out.println("running method 88");
		throw new IncompatibleClassChangeError();
	}

	public void method88() {
		System.out.println("running method 88");
		throw new NoClassDefFoundError();
	}

	public void method89() {
		System.out.println("running method 89");
		throw new NoClassDefFoundError();
	}

	public void method90() {
		System.out.println("running method 90");
		throw new UnsatisfiedLinkError();
	}

	public void method91() {
		System.out.println("running method 91");
		throw new UnsatisfiedLinkError(null);
	}

	public void method92() {
		System.out.println("running method 92");
		throw new VerifyError();
	}

	public void method93() {
		System.out.println("running method 93");
		throw new VerifyError(null);
	}

	public void method94() {
		System.out.println("running method 94");
		throw new GenericSignatureFormatError();
	}

	public void method95() {
		System.out.println("running method 95");
		throw new GenericSignatureFormatError(null);
	}

	public void method96() {
		System.out.println("running method 96");
		throw new UnsatisfiedLinkError();
	}

	public void method97() {
		System.out.println("running method 97");
		throw new AbstractMethodError(null);
	}

	public void method98() {
		System.out.println("running method 98");
		throw new AbstractMethodError();
	}

	public void method99() {
		System.out.println("running method 99");
		throw new TransformerFactoryConfigurationError(null, null);
	}

	public void method100() {
		System.out.println("running method 100");
		throw new GenericSignatureFormatError(null);
	}
}
