.class final LK0/T$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/T;->z1(LK0/u0;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/T;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:LK0/u0;


# direct methods
.method constructor <init>(LK0/T;JJLK0/u0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/T$d;->a:LK0/T;

    .line 2
    .line 3
    iput-wide p2, p0, LK0/T$d;->b:J

    .line 4
    .line 5
    iput-wide p4, p0, LK0/T$d;->c:J

    .line 6
    .line 7
    iput-object p6, p0, LK0/T$d;->d:LK0/u0;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/T$d;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, LK0/T$d;->a:LK0/T;

    invoke-static {v0}, LK0/T;->u1(LK0/T;)LK0/T$c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LK0/T$c;->p(Z)V

    .line 3
    iget-object v0, p0, LK0/T$d;->a:LK0/T;

    invoke-static {v0}, LK0/T;->u1(LK0/T;)LK0/T$c;

    move-result-object v0

    iget-wide v1, p0, LK0/T$d;->b:J

    invoke-virtual {v0, v1, v2}, LK0/T$c;->q(J)V

    .line 4
    iget-object v0, p0, LK0/T$d;->a:LK0/T;

    invoke-static {v0}, LK0/T;->u1(LK0/T;)LK0/T$c;

    move-result-object v0

    iget-wide v1, p0, LK0/T$d;->c:J

    invoke-virtual {v0, v1, v2}, LK0/T$c;->z(J)V

    .line 5
    iget-object v0, p0, LK0/T$d;->d:LK0/u0;

    invoke-virtual {v0}, LK0/u0;->b()LI0/C;

    move-result-object v0

    invoke-interface {v0}, LI0/C;->B()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LK0/T$d;->a:LK0/T;

    invoke-static {v1}, LK0/T;->u1(LK0/T;)LK0/T$c;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
