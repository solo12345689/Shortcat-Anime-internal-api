.class final Lw/p0$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/p0;->b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/o0;

.field final synthetic b:Lw/o0$a;


# direct methods
.method constructor <init>(Lw/o0;Lw/o0$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/p0$d;->a:Lw/o0;

    .line 2
    .line 3
    iput-object p2, p0, Lw/p0$d;->b:Lw/o0$a;

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
    .locals 2

    .line 2
    iget-object p1, p0, Lw/p0$d;->a:Lw/o0;

    iget-object v0, p0, Lw/p0$d;->b:Lw/o0$a;

    .line 3
    new-instance v1, Lw/p0$d$a;

    invoke-direct {v1, p1, v0}, Lw/p0$d$a;-><init>(Lw/o0;Lw/o0$a;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, Lw/p0$d;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
