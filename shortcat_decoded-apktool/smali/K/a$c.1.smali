.class final LK/a$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a;->a(LQ/i;Landroidx/compose/ui/e;JLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/i;


# direct methods
.method constructor <init>(LQ/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/a$c;->a:LQ/i;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LR0/C;

    invoke-virtual {p0, p1}, LK/a$c;->invoke(LR0/C;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LR0/C;)V
    .locals 8

    .line 2
    invoke-static {}, LQ/v;->d()LR0/B;

    move-result-object v0

    new-instance v1, LQ/u;

    .line 3
    sget-object v2, LK/l;->a:LK/l;

    .line 4
    iget-object v3, p0, LK/a$c;->a:LQ/i;

    invoke-interface {v3}, LQ/i;->a()J

    move-result-wide v3

    .line 5
    sget-object v5, LQ/t;->b:LQ/t;

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 6
    invoke-direct/range {v1 .. v7}, LQ/u;-><init>(LK/l;JLQ/t;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0, v1}, LR0/C;->b(LR0/B;Ljava/lang/Object;)V

    return-void
.end method
