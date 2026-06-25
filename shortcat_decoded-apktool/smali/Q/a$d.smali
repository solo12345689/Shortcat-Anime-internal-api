.class final LQ/a$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/a;->b(LQ/i;ZLg1/i;ZJLandroidx/compose/ui/e;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/i;

.field final synthetic b:Z

.field final synthetic c:Z


# direct methods
.method constructor <init>(LQ/i;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/a$d;->a:LQ/i;

    .line 2
    .line 3
    iput-boolean p2, p0, LQ/a$d;->b:Z

    .line 4
    .line 5
    iput-boolean p3, p0, LQ/a$d;->c:Z

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LR0/C;

    invoke-virtual {p0, p1}, LQ/a$d;->invoke(LR0/C;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LR0/C;)V
    .locals 8

    .line 2
    iget-object v0, p0, LQ/a$d;->a:LQ/i;

    invoke-interface {v0}, LQ/i;->a()J

    move-result-wide v3

    .line 3
    invoke-static {}, LQ/v;->d()LR0/B;

    move-result-object v0

    new-instance v1, LQ/u;

    .line 4
    iget-boolean v2, p0, LQ/a$d;->b:Z

    if-eqz v2, :cond_0

    sget-object v2, LK/l;->b:LK/l;

    goto :goto_0

    :cond_0
    sget-object v2, LK/l;->c:LK/l;

    .line 5
    :goto_0
    iget-boolean v5, p0, LQ/a$d;->c:Z

    if-eqz v5, :cond_1

    sget-object v5, LQ/t;->a:LQ/t;

    goto :goto_1

    :cond_1
    sget-object v5, LQ/t;->c:LQ/t;

    .line 6
    :goto_1
    invoke-static {v3, v4}, Lr0/g;->b(J)Z

    move-result v6

    const/4 v7, 0x0

    .line 7
    invoke-direct/range {v1 .. v7}, LQ/u;-><init>(LK/l;JLQ/t;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0, v1}, LR0/C;->b(LR0/B;Ljava/lang/Object;)V

    return-void
.end method
