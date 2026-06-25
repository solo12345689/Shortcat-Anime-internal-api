.class final LG/m$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/m;->e(Landroidx/compose/ui/e;LG/C;ZLGf/O;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LG/C;

.field final synthetic c:LGf/O;


# direct methods
.method constructor <init>(ZLG/C;LGf/O;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LG/m$b;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, LG/m$b;->b:LG/C;

    .line 4
    .line 5
    iput-object p3, p0, LG/m$b;->c:LGf/O;

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

    invoke-virtual {p0, p1}, LG/m$b;->invoke(LR0/C;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LR0/C;)V
    .locals 5

    .line 2
    iget-boolean v0, p0, LG/m$b;->a:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, LG/m$b$a;

    iget-object v3, p0, LG/m$b;->b:LG/C;

    iget-object v4, p0, LG/m$b;->c:LGf/O;

    invoke-direct {v0, v3, v4}, LG/m$b$a;-><init>(LG/C;LGf/O;)V

    invoke-static {p1, v2, v0, v1, v2}, LR0/A;->F(LR0/C;Ljava/lang/String;Lie/a;ILjava/lang/Object;)V

    .line 4
    new-instance v0, LG/m$b$b;

    iget-object v3, p0, LG/m$b;->b:LG/C;

    iget-object v4, p0, LG/m$b;->c:LGf/O;

    invoke-direct {v0, v3, v4}, LG/m$b$b;-><init>(LG/C;LGf/O;)V

    invoke-static {p1, v2, v0, v1, v2}, LR0/A;->z(LR0/C;Ljava/lang/String;Lie/a;ILjava/lang/Object;)V

    return-void

    .line 5
    :cond_0
    new-instance v0, LG/m$b$c;

    iget-object v3, p0, LG/m$b;->b:LG/C;

    iget-object v4, p0, LG/m$b;->c:LGf/O;

    invoke-direct {v0, v3, v4}, LG/m$b$c;-><init>(LG/C;LGf/O;)V

    invoke-static {p1, v2, v0, v1, v2}, LR0/A;->B(LR0/C;Ljava/lang/String;Lie/a;ILjava/lang/Object;)V

    .line 6
    new-instance v0, LG/m$b$d;

    iget-object v3, p0, LG/m$b;->b:LG/C;

    iget-object v4, p0, LG/m$b;->c:LGf/O;

    invoke-direct {v0, v3, v4}, LG/m$b$d;-><init>(LG/C;LGf/O;)V

    invoke-static {p1, v2, v0, v1, v2}, LR0/A;->D(LR0/C;Ljava/lang/String;Lie/a;ILjava/lang/Object;)V

    return-void
.end method
