.class Lr/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/d;->U(ILjava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/CharSequence;

.field final synthetic c:Lr/d;


# direct methods
.method constructor <init>(Lr/d;ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/d$a;->c:Lr/d;

    .line 2
    .line 3
    iput p2, p0, Lr/d$a;->a:I

    .line 4
    .line 5
    iput-object p3, p0, Lr/d$a;->b:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/d$a;->c:Lr/d;

    .line 2
    .line 3
    iget-object v0, v0, Lr/d;->b:Lr/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/g;->h()Lr/f$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, p0, Lr/d$a;->a:I

    .line 10
    .line 11
    iget-object v2, p0, Lr/d$a;->b:Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lr/f$a;->a(ILjava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
