.class public abstract Lexpo/modules/kotlin/jni/JNIUtils;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/jni/JNIUtils$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/JNIUtils;",
        "",
        "a",
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
.field public static final a:Lexpo/modules/kotlin/jni/JNIUtils$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/JNIUtils$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/JNIUtils$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/kotlin/jni/JNIUtils;->a:Lexpo/modules/kotlin/jni/JNIUtils$a;

    .line 8
    .line 9
    return-void
.end method

.method public static final native emitEvent(Lexpo/modules/kotlin/jni/JavaScriptModuleObject;Lexpo/modules/kotlin/jni/JSIContext;Ljava/lang/String;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;",
            "Lexpo/modules/kotlin/jni/JSIContext;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public static final native emitEvent(Lexpo/modules/kotlin/jni/JavaScriptObject;Lexpo/modules/kotlin/jni/JSIContext;Ljava/lang/String;[Ljava/lang/Object;)V
.end method

.method public static final native emitEvent(Lexpo/modules/kotlin/jni/JavaScriptWeakObject;Lexpo/modules/kotlin/jni/JSIContext;Ljava/lang/String;[Ljava/lang/Object;)V
.end method
