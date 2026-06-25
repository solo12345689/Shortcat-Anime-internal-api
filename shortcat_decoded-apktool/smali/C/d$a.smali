.class final LC/d$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/d;->a(Landroidx/compose/ui/e;Ll0/e;ZLie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI0/B;

.field final synthetic b:Lie/o;


# direct methods
.method constructor <init>(LI0/B;Lie/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/d$a;->a:LI0/B;

    .line 2
    .line 3
    iput-object p2, p0, LC/d$a;->b:Lie/o;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LI0/P;

    .line 2
    .line 3
    check-cast p2, Li1/b;

    .line 4
    .line 5
    invoke-virtual {p2}, Li1/b;->r()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, p1, v0, v1}, LC/d$a;->invoke-0kLqBqw(LI0/P;J)LI0/C;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final invoke-0kLqBqw(LI0/P;J)LI0/C;
    .locals 4

    .line 1
    new-instance v0, LC/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p2, p3, v1}, LC/f;-><init>(Li1/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sget-object v1, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    new-instance v2, LC/d$a$a;

    .line 10
    .line 11
    iget-object v3, p0, LC/d$a;->b:Lie/o;

    .line 12
    .line 13
    invoke-direct {v2, v3, v0}, LC/d$a$a;-><init>(Lie/o;LC/f;)V

    .line 14
    .line 15
    .line 16
    const v0, -0x73eea2c7

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-static {v0, v3, v2}, Lg0/i;->b(IZLjava/lang/Object;)Lg0/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v1, v0}, LI0/P;->M(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, LC/d$a;->a:LI0/B;

    .line 29
    .line 30
    invoke-interface {v1, p1, v0, p2, p3}, LI0/B;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method
