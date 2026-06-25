.class final Lx0/m$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/m;-><init>(Lx0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx0/m;


# direct methods
.method constructor <init>(Lx0/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/m$a;->a:Lx0/m;

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
.method public final a(Lx0/l;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lx0/m$a;->a:Lx0/m;

    .line 2
    .line 3
    invoke-static {p1}, Lx0/m;->e(Lx0/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lx0/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx0/m$a;->a(Lx0/l;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
