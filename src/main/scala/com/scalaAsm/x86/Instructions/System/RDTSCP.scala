package com.scalaAsm.x86
package Instructions
package System

// Description: Read Time-Stamp Counter and Processor ID
// Category: general

trait RDTSCP extends InstructionDefinition {
  val mnemonic = "RDTSCP"
}

object RDTSCP extends ZeroOperands[RDTSCP] with RDTSCPImpl

trait RDTSCPImpl extends RDTSCP {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 7
        override def hasImplicitOperand = true
  }
}
