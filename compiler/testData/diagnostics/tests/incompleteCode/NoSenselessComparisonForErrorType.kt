// !WITH_NEW_INFERENCE
package a

fun foo() {
    val a = <!NI;UNRESOLVED_REFERENCE!><!UNRESOLVED_REFERENCE!>getErrorType<!><!>()
    if (<!NI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!><!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>a<!><!> <!NI;RESULT_TYPE_MISMATCH!><!NI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!><!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>==<!><!><!> null) { //no senseless comparison

    }
}