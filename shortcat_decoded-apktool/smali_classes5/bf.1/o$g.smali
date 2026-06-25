.class final Lbf/o$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/o;->q(Lye/b;Ljava/util/Queue;Lbf/n;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbf/n;

.field final synthetic b:Lye/b;


# direct methods
.method constructor <init>(Lbf/n;Lye/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbf/o$g;->a:Lbf/n;

    .line 2
    .line 3
    iput-object p2, p0, Lbf/o$g;->b:Lye/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lye/b;)LTd/L;
    .locals 2

    .line 1
    iget-object v0, p0, Lbf/o$g;->a:Lbf/n;

    .line 2
    .line 3
    iget-object v1, p0, Lbf/o$g;->b:Lye/b;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lbf/n;->b(Lye/b;Lye/b;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lye/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbf/o$g;->a(Lye/b;)LTd/L;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
