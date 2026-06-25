.class public final LDb/a;
.super Ldg/D;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Ldg/D;

.field private final c:LDb/b;


# direct methods
.method public constructor <init>(Ldg/D;LDb/b;)V
    .locals 1

    .line 1
    const-string v0, "requestBody"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "progressListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldg/D;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LDb/a;->b:Ldg/D;

    .line 15
    .line 16
    iput-object p2, p0, LDb/a;->c:LDb/b;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, LDb/a;->b:Ldg/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/D;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public b()Ldg/x;
    .locals 1

    .line 1
    iget-object v0, p0, LDb/a;->b:Ldg/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/D;->b()Ldg/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f(Ltg/i;)V
    .locals 2

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LDb/c;

    .line 7
    .line 8
    iget-object v1, p0, LDb/a;->c:LDb/b;

    .line 9
    .line 10
    invoke-direct {v0, p1, p0, v1}, LDb/c;-><init>(Ltg/X;Ldg/D;LDb/b;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ltg/K;->c(Ltg/X;)Ltg/i;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, LDb/a;->b:Ldg/D;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ldg/D;->f(Ltg/i;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ltg/i;->flush()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
