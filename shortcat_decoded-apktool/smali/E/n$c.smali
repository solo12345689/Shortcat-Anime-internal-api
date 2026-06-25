.class final LE/n$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/n;->a(LE/I;Lkotlin/jvm/functions/Function1;LY/m;I)Lie/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/h2;

.field final synthetic b:LE/I;


# direct methods
.method constructor <init>(LY/h2;LE/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/n$c;->a:LY/h2;

    .line 2
    .line 3
    iput-object p2, p0, LE/n$c;->b:LE/I;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()LE/m;
    .locals 4

    .line 1
    iget-object v0, p0, LE/n$c;->a:LY/h2;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE/j;

    .line 8
    .line 9
    new-instance v1, LF/H;

    .line 10
    .line 11
    iget-object v2, p0, LE/n$c;->b:LE/I;

    .line 12
    .line 13
    invoke-virtual {v2}, LE/I;->u()Loe/f;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2, v0}, LF/H;-><init>(Loe/f;LF/m;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, LE/m;

    .line 21
    .line 22
    iget-object v3, p0, LE/n$c;->b:LE/I;

    .line 23
    .line 24
    invoke-direct {v2, v3, v0, v1}, LE/m;-><init>(LE/I;LE/j;Landroidx/compose/foundation/lazy/layout/c;)V

    .line 25
    .line 26
    .line 27
    return-object v2
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE/n$c;->a()LE/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
