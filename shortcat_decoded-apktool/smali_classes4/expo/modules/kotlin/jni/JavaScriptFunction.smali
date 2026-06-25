.class public final Lexpo/modules/kotlin/jni/JavaScriptFunction;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/jni/Destructible;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReturnType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lexpo/modules/kotlin/jni/Destructible;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000*\n\u0008\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003B\u0011\u0008\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J4\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\r\u001a\u00020\u000cH\u0082 \u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0004\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015R*\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0013\u0010\u0017\u0012\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/JavaScriptFunction;",
        "",
        "ReturnType",
        "Lexpo/modules/kotlin/jni/Destructible;",
        "Lcom/facebook/jni/HybridData;",
        "mHybridData",
        "<init>",
        "(Lcom/facebook/jni/HybridData;)V",
        "Lexpo/modules/kotlin/jni/JavaScriptObject;",
        "thisValue",
        "",
        "args",
        "Lexpo/modules/kotlin/jni/ExpectedType;",
        "expectedReturnType",
        "invoke",
        "(Lexpo/modules/kotlin/jni/JavaScriptObject;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/ExpectedType;)Ljava/lang/Object;",
        "LTd/L;",
        "finalize",
        "()V",
        "a",
        "()Lcom/facebook/jni/HybridData;",
        "Lcom/facebook/jni/HybridData;",
        "Lpe/q;",
        "Lpe/q;",
        "getReturnType",
        "()Lpe/q;",
        "b",
        "(Lpe/q;)V",
        "getReturnType$annotations",
        "returnType",
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
.field private a:Lpe/q;

.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method private constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/jni/JavaScriptFunction;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 5
    .line 6
    return-void
.end method

.method private final native invoke(Lexpo/modules/kotlin/jni/JavaScriptObject;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/ExpectedType;)Ljava/lang/Object;
.end method


# virtual methods
.method public a()Lcom/facebook/jni/HybridData;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaScriptFunction;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Lpe/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/jni/JavaScriptFunction;->a:Lpe/q;

    .line 2
    .line 3
    return-void
.end method

.method protected final finalize()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaScriptFunction;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
