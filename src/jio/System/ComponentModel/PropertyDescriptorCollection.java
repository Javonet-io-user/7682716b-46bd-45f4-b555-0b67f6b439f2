package jio.System.ComponentModel;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import jio.System.Collections.*;
import jio.System.*;public class PropertyDescriptorCollection implements ICollection,IEnumerable,IList,IDictionary {protected NObject javonetHandle; public PropertyDescriptorCollection (PropertyDescriptor[] properties){ try {  javonetHandle = Javonet.New("PropertyDescriptorCollection",new Object[] {properties});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyDescriptorCollection (PropertyDescriptor[] properties,java.lang.Boolean readOnly){ try {  javonetHandle = Javonet.New("PropertyDescriptorCollection",new Object[] {properties},readOnly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyDescriptorCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer get_Count (){ try { return javonetHandle.invoke("get_Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public NObject get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsSynchronized (){ try { return javonetHandle.invoke("get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject get_Item (java.lang.Integer index){ try { return  (NObject) javonetHandle.invoke("get_Item",index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void set_Item (java.lang.Integer index,NObject value){ try { javonetHandle.invoke("set_Item",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer Add (NObject value){ try { return javonetHandle.invoke("Add",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (NObject value){ try { return javonetHandle.invoke("Contains",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean get_IsReadOnly (){ try { return javonetHandle.invoke("get_IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsFixedSize (){ try { return javonetHandle.invoke("get_IsFixedSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (NObject value){ try { return javonetHandle.invoke("IndexOf",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,NObject value){ try { javonetHandle.invoke("Insert",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Remove (NObject value){ try { javonetHandle.invoke("Remove",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RemoveAt (java.lang.Integer index){ try { javonetHandle.invoke("RemoveAt",index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_Item (NObject key){ try { return  (NObject) javonetHandle.invoke("get_Item",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void set_Item (NObject key,NObject value){ try { javonetHandle.invoke("set_Item",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ICollection get_Keys (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Keys"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ICollection get_Values (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Add (NObject key,NObject value){ try { javonetHandle.invoke("Add",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}