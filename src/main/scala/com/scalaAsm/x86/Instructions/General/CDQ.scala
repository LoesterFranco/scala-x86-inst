package com.scalaAsm.x86
package Instructions
package General

// Description: Convert Doubleword to Quadword
// Category: general/conver

trait CDQ extends InstructionDefinition {
  val mnemonic = "CDQ"
}

object CDQ extends ZeroOperands[CDQ] with CDQImpl

trait CDQImpl extends CDQ {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x99
        override def hasImplicitOperand = true
  }
}
