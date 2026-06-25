.class final LQ/H$b$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/H$b;->c(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li1/d;

.field final synthetic b:LY/C0;


# direct methods
.method constructor <init>(Li1/d;LY/C0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/H$b$b;->a:Li1/d;

    .line 2
    .line 3
    iput-object p2, p0, LQ/H$b$b;->b:LY/C0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lie/a;)Landroidx/compose/ui/e;
    .locals 14

    .line 1
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 2
    .line 3
    new-instance v1, LQ/H$b$b$a;

    .line 4
    .line 5
    invoke-direct {v1, p1}, LQ/H$b$b$a;-><init>(Lie/a;)V

    .line 6
    .line 7
    .line 8
    new-instance v3, LQ/H$b$b$b;

    .line 9
    .line 10
    iget-object p1, p0, LQ/H$b$b;->a:Li1/d;

    .line 11
    .line 12
    iget-object v2, p0, LQ/H$b$b;->b:LY/C0;

    .line 13
    .line 14
    invoke-direct {v3, p1, v2}, LQ/H$b$b$b;-><init>(Li1/d;LY/C0;)V

    .line 15
    .line 16
    .line 17
    sget-object p1, Lx/W;->a:Lx/W$a;

    .line 18
    .line 19
    invoke-virtual {p1}, Lx/W$a;->a()Lx/W;

    .line 20
    .line 21
    .line 22
    move-result-object v11

    .line 23
    const/16 v12, 0x1ea

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-static/range {v0 .. v13}, Lx/K;->f(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLx/W;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lie/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQ/H$b$b;->a(Lie/a;)Landroidx/compose/ui/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
