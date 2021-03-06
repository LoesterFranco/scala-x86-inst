package com.scalaAsm.x86
package Instructions
package System

// Description: Verify a Segment for Reading
// Category: general

trait VERR extends InstructionDefinition {
  val mnemonic = "VERR"
}

object VERR extends OneOperand[VERR] with VERRImpl

trait VERRImpl extends VERR {
  implicit object _0 extends OneOp[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 4
    val format = RmFormat
  }
}
