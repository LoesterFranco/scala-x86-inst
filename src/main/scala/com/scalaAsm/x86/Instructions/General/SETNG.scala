package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/datamov

trait SETNG extends InstructionDefinition {
  val mnemonic = "SETNG"
}

object SETNG extends SETNG with OneOperand[SETNG] with SETNGImpl

trait SETNGImpl {
  self: SETNG =>
  implicit object SETNG_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9E) /+ 0
  }
}
