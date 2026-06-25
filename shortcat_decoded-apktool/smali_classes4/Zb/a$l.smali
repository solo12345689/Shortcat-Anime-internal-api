.class public final LZb/a$l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZb/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LZb/a;


# direct methods
.method public constructor <init>(LZb/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZb/a$l;->a:LZb/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LZb/a$l;->a:LZb/a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lgc/c;->i()LUb/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, LUb/d;->D()Llc/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Llc/a;->d()Lexpo/modules/kotlin/jni/JSIContext;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JSIContext;->global()Lexpo/modules/kotlin/jni/JavaScriptObject;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "_WORKLET_RUNTIME"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/jni/JavaScriptObject;->j(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptValue;->isObject()Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptValue;->getObject()Lexpo/modules/kotlin/jni/JavaScriptObject;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptObject;->isArrayBuffer()Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptObject;->getArrayBuffer()Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;->size()I

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;->read8Byte(I)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    new-instance p1, LZb/a$a;

    .line 55
    .line 56
    iget-object v2, p0, LZb/a$l;->a:LZb/a;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-direct {p1, v2, v0, v1, v3}, LZb/a$a;-><init>(LZb/a;JLZd/e;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-static {v3, p1, v0, v3}, LGf/i;->f(LZd/i;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object p1, LTd/L;->a:LTd/L;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "UI Runtime is not available. Make sure you have Reanimated installed and imported in your project."

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LZb/a$l;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
