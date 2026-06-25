.class public final Lexpo/modules/kotlin/jni/MainRuntimeInstaller;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/jni/MainRuntimeInstaller$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J6\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0082 \u00a2\u0006\u0004\u0008\u000f\u0010\u0010J6\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 \u00a2\u0006\u0004\u0008\u000f\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/MainRuntimeInstaller;",
        "",
        "Llc/a;",
        "runtimeContext",
        "<init>",
        "(Llc/a;)V",
        "Ljava/lang/ref/WeakReference;",
        "runtimeContextHolder",
        "",
        "jsRuntimePointer",
        "Lexpo/modules/kotlin/jni/JNIDeallocator;",
        "jniDeallocator",
        "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;",
        "jsInvokerHolder",
        "Lexpo/modules/kotlin/jni/JSIContext;",
        "install",
        "(Ljava/lang/ref/WeakReference;JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)Lexpo/modules/kotlin/jni/JSIContext;",
        "Lcom/facebook/react/bridge/RuntimeExecutor;",
        "runtimeExecutor",
        "(Ljava/lang/ref/WeakReference;JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)Lexpo/modules/kotlin/jni/JSIContext;",
        "a",
        "(JLcom/facebook/react/bridge/RuntimeExecutor;)Lexpo/modules/kotlin/jni/JSIContext;",
        "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;",
        "getCoreModuleObject",
        "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;",
        "Llc/a;",
        "getRuntimeContext",
        "()Llc/a;",
        "b",
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


# static fields
.field public static final b:Lexpo/modules/kotlin/jni/MainRuntimeInstaller$a;


# instance fields
.field private final a:Llc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/MainRuntimeInstaller$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/MainRuntimeInstaller$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;->b:Lexpo/modules/kotlin/jni/MainRuntimeInstaller$a;

    .line 8
    .line 9
    const-string v0, "expo-modules-core"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Llc/a;)V
    .locals 1

    .line 1
    const-string v0, "runtimeContext"

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
    iput-object p1, p0, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;->a:Llc/a;

    .line 10
    .line 11
    return-void
.end method

.method private final native install(Ljava/lang/ref/WeakReference;JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)Lexpo/modules/kotlin/jni/JSIContext;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;J",
            "Lexpo/modules/kotlin/jni/JNIDeallocator;",
            "Lcom/facebook/react/bridge/RuntimeExecutor;",
            ")",
            "Lexpo/modules/kotlin/jni/JSIContext;"
        }
    .end annotation
.end method

.method private final native install(Ljava/lang/ref/WeakReference;JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)Lexpo/modules/kotlin/jni/JSIContext;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;J",
            "Lexpo/modules/kotlin/jni/JNIDeallocator;",
            "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;",
            ")",
            "Lexpo/modules/kotlin/jni/JSIContext;"
        }
    .end annotation
.end method


# virtual methods
.method public final a(JLcom/facebook/react/bridge/RuntimeExecutor;)Lexpo/modules/kotlin/jni/JSIContext;
    .locals 7

    .line 1
    const-string v0, "runtimeExecutor"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;->a:Llc/a;

    .line 7
    .line 8
    invoke-static {v0}, LUb/A;->a(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v0, p0, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;->a:Llc/a;

    .line 13
    .line 14
    invoke-virtual {v0}, Llc/a;->i()Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    move-object v1, p0

    .line 19
    move-wide v3, p1

    .line 20
    move-object v6, p3

    .line 21
    invoke-direct/range {v1 .. v6}, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;->install(Ljava/lang/ref/WeakReference;JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)Lexpo/modules/kotlin/jni/JSIContext;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public final getCoreModuleObject()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;->a:Llc/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Llc/a;->h()LUb/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LUb/r;->f()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
