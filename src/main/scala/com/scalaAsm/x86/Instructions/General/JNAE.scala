package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if below/not above or equal/carry (CF=1)
// Category: general/branch/cond

trait JNAE extends InstructionDefinition {
  val mnemonic = "JNAE"
}

object JNAE extends OneOperand[JNAE] with JNAEImpl

trait JNAEImpl extends JNAE {
  implicit object JNAE_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x72
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JNAE_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
    val format = ImmFormat
    val hasRMByte = false
  }

  implicit object JNAE_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x82)
    val format = ImmFormat
    val hasRMByte = false
  }
}
