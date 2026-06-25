.class final LF/D$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/D;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/D;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(LF/D;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/D$c;->a:LF/D;

    .line 2
    .line 3
    iput-object p2, p0, LF/D$c;->b:Ljava/lang/Object;

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
    iget-object p1, p0, LF/D$c;->a:LF/D;

    invoke-static {p1}, LF/D;->g(LF/D;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v0, p0, LF/D$c;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, LF/D$c;->a:LF/D;

    iget-object v0, p0, LF/D$c;->b:Ljava/lang/Object;

    .line 4
    new-instance v1, LF/D$c$a;

    invoke-direct {v1, p1, v0}, LF/D$c$a;-><init>(LF/D;Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, LF/D$c;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
