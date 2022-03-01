# README

## 場合分け

## 状態遷移

```mermaid
flowchart TD
    beginpoint --apply--> examination
    
    examination --approve--> approved
    examination --sendback--> remand
    
    remand --reapply--> examination
    remand --withdraw--> close
    
    approved --start--> execution
    approved --withdraw --> close
    
    execution --suspend--> pending
    execution --finish--> close
    
    pending --cancel--> close
    pending --restart--> execution
    
    close --> endpoint
```