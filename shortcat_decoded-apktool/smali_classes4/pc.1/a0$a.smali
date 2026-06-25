.class public final Lpc/a0$a;
.super Lpc/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/a0;->b()Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/kotlin/jni/ExpectedType;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/jni/ExpectedType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpc/a0$a;->a:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    invoke-direct {p0}, Lpc/u;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 1

    .line 1
    iget-object v0, p0, Lpc/a0$a;->a:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p2, "value"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    return-object p1
.end method

.method public f(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p2, "value"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    double-to-int p1, p1

    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
