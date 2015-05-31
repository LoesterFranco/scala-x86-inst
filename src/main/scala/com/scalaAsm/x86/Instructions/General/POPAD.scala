package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Pop All General-Purpose Registers
// Category: general/stack

trait POPAD extends InstructionDefinition {
  val mnemonic = "POPAD"
}

object POPAD extends ZeroOperands[POPAD] with POPADImpl

trait POPADImpl extends POPAD {
  implicit object POPAD_0 extends _0 {
    val opcode: OneOpcode = 0x61
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
