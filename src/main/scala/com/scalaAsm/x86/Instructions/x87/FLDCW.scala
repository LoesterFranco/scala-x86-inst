package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load x87 FPU Control Word
// Category: general/control

trait FLDCW extends InstructionDefinition {
  val mnemonic = "FLDCW"
}

object FLDCW extends OneOperand[FLDCW] with FLDCWImpl

trait FLDCWImpl extends FLDCW {
  implicit object FLDCW_0 extends _1[m16] {
    val opcode: OneOpcode = 0xD9 /+ 5
    val format = RmFormat
    val hasRMByte = true
  }
}
