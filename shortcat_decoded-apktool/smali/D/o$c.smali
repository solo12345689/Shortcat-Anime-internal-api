.class final LD/o$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/o;->a(LD/B;Lkotlin/jvm/functions/Function1;LY/m;I)Lie/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/h2;

.field final synthetic b:LD/B;

.field final synthetic c:LD/d;


# direct methods
.method constructor <init>(LY/h2;LD/B;LD/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/o$c;->a:LY/h2;

    .line 2
    .line 3
    iput-object p2, p0, LD/o$c;->b:LD/B;

    .line 4
    .line 5
    iput-object p3, p0, LD/o$c;->c:LD/d;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()LD/n;
    .locals 5

    .line 1
    iget-object v0, p0, LD/o$c;->a:LY/h2;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LD/k;

    .line 8
    .line 9
    new-instance v1, LF/H;

    .line 10
    .line 11
    iget-object v2, p0, LD/o$c;->b:LD/B;

    .line 12
    .line 13
    invoke-virtual {v2}, LD/B;->w()Loe/f;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2, v0}, LF/H;-><init>(Loe/f;LF/m;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, LD/n;

    .line 21
    .line 22
    iget-object v3, p0, LD/o$c;->b:LD/B;

    .line 23
    .line 24
    iget-object v4, p0, LD/o$c;->c:LD/d;

    .line 25
    .line 26
    invoke-direct {v2, v3, v0, v4, v1}, LD/n;-><init>(LD/B;LD/k;LD/d;Landroidx/compose/foundation/lazy/layout/c;)V

    .line 27
    .line 28
    .line 29
    return-object v2
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LD/o$c;->a()LD/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
