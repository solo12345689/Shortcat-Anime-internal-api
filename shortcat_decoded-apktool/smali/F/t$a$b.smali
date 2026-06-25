.class final LF/t$a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/t$a;->a(Lh0/g;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/o;

.field final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(LF/o;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/t$a$b;->a:LF/o;

    .line 2
    .line 3
    iput-object p2, p0, LF/t$a$b;->b:Lkotlin/jvm/functions/Function2;

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
    invoke-virtual {p0, p1, v0, v1}, LF/t$a$b;->invoke-0kLqBqw(LI0/P;J)LI0/C;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final invoke-0kLqBqw(LI0/P;J)LI0/C;
    .locals 2

    .line 1
    new-instance v0, LF/v;

    .line 2
    .line 3
    iget-object v1, p0, LF/t$a$b;->a:LF/o;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LF/v;-><init>(LF/o;LI0/P;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LF/t$a$b;->b:Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    invoke-static {p2, p3}, Li1/b;->a(J)Li1/b;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {p1, v0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, LI0/C;

    .line 19
    .line 20
    return-object p1
.end method
