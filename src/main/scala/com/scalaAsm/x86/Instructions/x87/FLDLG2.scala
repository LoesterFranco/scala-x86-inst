package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Constant log102
// Category: general/ldconst

trait FLDLG2 extends InstructionDefinition {
  val mnemonic = "FLDLG2"
}

object FLDLG2 extends ZeroOperands[FLDLG2] with FLDLG2Impl

trait FLDLG2Impl extends FLDLG2 {
  implicit object FLDLG2_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 5
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
