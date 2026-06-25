.class final LG/m$b$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/m$b;->invoke(LR0/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LG/C;

.field final synthetic b:LGf/O;


# direct methods
.method constructor <init>(LG/C;LGf/O;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/m$b$b;->a:LG/C;

    .line 2
    .line 3
    iput-object p2, p0, LG/m$b$b;->b:LGf/O;

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
.method public final invoke()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, LG/m$b$b;->a:LG/C;

    iget-object v1, p0, LG/m$b$b;->b:LGf/O;

    invoke-static {v0, v1}, LG/m;->c(LG/C;LGf/O;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, LG/m$b$b;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
