package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - below or equal/not above (CF=1 AND ZF=1)
// Category: general/datamov

trait SETNA extends InstructionDefinition {
  val mnemonic = "SETNA"
}

object SETNA extends OneOperand[SETNA] with SETNAImpl

trait SETNAImpl extends SETNA {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x96) /+ 0
    val format = RmFormat
  }
}
