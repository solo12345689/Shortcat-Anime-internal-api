.class final Lp2/a$a;
.super Lp2/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field f:Z

.field final synthetic g:Lp2/a;


# direct methods
.method constructor <init>(Lp2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp2/a$a;->g:Lp2/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lp2/c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp2/a$a;->g:Lp2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp2/a;->E()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method protected g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp2/a$a;->g:Lp2/a;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lp2/a;->y(Lp2/a$a;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected h(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp2/a$a;->g:Lp2/a;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lp2/a;->z(Lp2/a$a;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public run()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lp2/a$a;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Lp2/a$a;->g:Lp2/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lp2/a;->A()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
