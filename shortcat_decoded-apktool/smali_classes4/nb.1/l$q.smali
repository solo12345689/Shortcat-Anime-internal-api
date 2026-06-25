.class public final Lnb/l$q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnb/l;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnb/l;


# direct methods
.method public constructor <init>(Lnb/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnb/l$q;->a:Lnb/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/l$q;->a:Lnb/l;

    .line 2
    .line 3
    new-instance v1, Lnb/l$a;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lnb/l$a;-><init>(Lnb/l;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lnb/l;->E(Lnb/l;Lnb/l$a;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lnb/l$q;->a:Lnb/l;

    .line 12
    .line 13
    invoke-static {v0}, Lnb/l;->A(Lnb/l;)Lnb/l$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "clipboardEventEmitter"

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    :cond_0
    invoke-virtual {v0}, Lnb/l$a;->b()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnb/l$q;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
