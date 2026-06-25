.class final Lad/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ln9/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LUb/u;

.field final synthetic b:Lgc/d;

.field final synthetic c:Lad/a;


# direct methods
.method constructor <init>(LUb/u;Lgc/d;Lad/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lad/a$a;->a:LUb/u;

    .line 2
    .line 3
    iput-object p2, p0, Lad/a$a;->b:Lgc/d;

    .line 4
    .line 5
    iput-object p3, p0, Lad/a$a;->c:Lad/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ln9/i;)V
    .locals 5

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "E_REGISTRATION_FAILED"

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lad/a$a;->a:LUb/u;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    :cond_0
    const-string v2, "unknown"

    .line 29
    .line 30
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v4, "Fetching the token failed: "

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v0, v1, v2, p1}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/String;

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p0, Lad/a$a;->a:LUb/u;

    .line 60
    .line 61
    const-string v0, "Fetching the token failed. Invalid token."

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-interface {p1, v1, v0, v2}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    iget-object v0, p0, Lad/a$a;->a:LUb/u;

    .line 69
    .line 70
    invoke-interface {v0, p1}, LUb/u;->resolve(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lad/a$a;->c:Lad/a;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lad/a;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
