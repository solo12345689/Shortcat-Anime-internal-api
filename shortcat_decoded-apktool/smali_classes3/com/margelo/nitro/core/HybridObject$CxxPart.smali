.class public Lcom/margelo/nitro/core/HybridObject$CxxPart;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/margelo/nitro/core/HybridObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "CxxPart"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0094 \u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/margelo/nitro/core/HybridObject$CxxPart;",
        "",
        "Lcom/margelo/nitro/core/HybridObject;",
        "javaPart",
        "<init>",
        "(Lcom/margelo/nitro/core/HybridObject;)V",
        "LTd/L;",
        "destroy",
        "()V",
        "Lcom/facebook/jni/HybridData;",
        "initHybrid",
        "()Lcom/facebook/jni/HybridData;",
        "Lcom/margelo/nitro/core/HybridObject;",
        "getJavaPart",
        "()Lcom/margelo/nitro/core/HybridObject;",
        "mHybridData",
        "Lcom/facebook/jni/HybridData;",
        "react-native-nitro-modules_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final javaPart:Lcom/margelo/nitro/core/HybridObject;

.field private mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method public constructor <init>(Lcom/margelo/nitro/core/HybridObject;)V
    .locals 1

    .line 1
    const-string v0, "javaPart"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/margelo/nitro/core/HybridObject$CxxPart;->javaPart:Lcom/margelo/nitro/core/HybridObject;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/margelo/nitro/core/HybridObject$CxxPart;->initHybrid()Lcom/facebook/jni/HybridData;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/margelo/nitro/core/HybridObject$CxxPart;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/margelo/nitro/core/HybridObject$CxxPart;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getJavaPart()Lcom/margelo/nitro/core/HybridObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/margelo/nitro/core/HybridObject$CxxPart;->javaPart:Lcom/margelo/nitro/core/HybridObject;

    .line 2
    .line 3
    return-object v0
.end method

.method protected native initHybrid()Lcom/facebook/jni/HybridData;
.end method
