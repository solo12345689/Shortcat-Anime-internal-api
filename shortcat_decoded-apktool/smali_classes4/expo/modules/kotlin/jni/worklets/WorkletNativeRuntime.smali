.class public final Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;",
        "",
        "",
        "jsRuntimePointer",
        "<init>",
        "(J)V",
        "Lcom/facebook/jni/HybridData;",
        "initHybrid",
        "(J)Lcom/facebook/jni/HybridData;",
        "a",
        "Lcom/facebook/jni/HybridData;",
        "mHybridData",
        "expo-modules-core_release"
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
.field private final a:Lcom/facebook/jni/HybridData;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;->initHybrid(J)Lcom/facebook/jni/HybridData;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;->a:Lcom/facebook/jni/HybridData;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final native initHybrid(J)Lcom/facebook/jni/HybridData;
.end method
