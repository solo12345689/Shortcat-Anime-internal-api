.class final LBb/e$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBb/e;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LUb/u;

.field final synthetic b:Lexpo/modules/fetch/NativeRequest;


# direct methods
.method constructor <init>(LUb/u;Lexpo/modules/fetch/NativeRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, LBb/e$d;->a:LUb/u;

    .line 2
    .line 3
    iput-object p2, p0, LBb/e$d;->b:Lexpo/modules/fetch/NativeRequest;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LBb/p;)V
    .locals 4

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LBb/p;->d:LBb/p;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, LBb/e$d;->a:LUb/u;

    .line 11
    .line 12
    invoke-interface {p1}, LUb/u;->b()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, LBb/p;->h:LBb/p;

    .line 17
    .line 18
    if-ne p1, v0, :cond_4

    .line 19
    .line 20
    iget-object p1, p0, LBb/e$d;->a:LUb/u;

    .line 21
    .line 22
    iget-object v0, p0, LBb/e$d;->b:Lexpo/modules/fetch/NativeRequest;

    .line 23
    .line 24
    invoke-virtual {v0}, Lexpo/modules/fetch/NativeRequest;->O()Lexpo/modules/fetch/NativeResponse;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lexpo/modules/fetch/NativeResponse;->M0()Ljava/lang/Exception;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    instance-of v1, v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    check-cast v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    instance-of v1, v0, Lrb/a;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    new-instance v1, Lexpo/modules/kotlin/exception/CodedException;

    .line 46
    .line 47
    check-cast v0, Lrb/a;

    .line 48
    .line 49
    invoke-virtual {v0}, Lrb/a;->a()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "getCode(...)"

    .line 54
    .line 55
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-direct {v1, v2, v3, v0}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    move-object v0, v1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    new-instance v1, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    new-instance v0, LBb/i;

    .line 78
    .line 79
    invoke-direct {v0}, LBb/i;-><init>()V

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-interface {p1, v0}, LUb/u;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LBb/p;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LBb/e$d;->a(LBb/p;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
