package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement count; Jump short if count!=0
// Category: general/branch/cond

trait LOOP extends InstructionDefinition {
  val mnemonic = "LOOP"
}

object LOOP extends LOOP with OneOperand[LOOP] with LOOPImpl

trait LOOPImpl {
  self: LOOP =>
  implicit object LOOP_0 extends _1[rel8] {
    val opcode: OneOpcode = 0xE2
    override def hasImplicitOperand = true
  }
}
