.class final Lw/o0$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/o0;->e(Ljava/lang/Object;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LGf/O;

.field final synthetic b:Lw/o0;


# direct methods
.method constructor <init>(LGf/O;Lw/o0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/o0$e;->a:LGf/O;

    .line 2
    .line 3
    iput-object p2, p0, Lw/o0$e;->b:Lw/o0;

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
.method public final invoke(LY/Y;)LY/X;
    .locals 6

    .line 2
    iget-object v0, p0, Lw/o0$e;->a:LGf/O;

    sget-object v2, LGf/Q;->d:LGf/Q;

    new-instance v3, Lw/o0$e$a;

    iget-object p1, p0, Lw/o0$e;->b:Lw/o0;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lw/o0$e$a;-><init>(Lw/o0;LZd/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 3
    new-instance p1, Lw/o0$e$b;

    invoke-direct {p1}, Lw/o0$e$b;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, Lw/o0$e;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
