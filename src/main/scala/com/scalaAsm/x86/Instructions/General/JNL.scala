package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not less/greater or equal (SF=OF)
// Category: general/branch/cond

trait JNL extends InstructionDefinition {
  val mnemonic = "JNL"
}

object JNL extends JNL with OneOperand[JNL] with JNLImpl

trait JNLImpl {
  self: JNL =>
  implicit object JNL_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7D
  }

  implicit object JNL_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
  }

  implicit object JNL_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
  }
}
