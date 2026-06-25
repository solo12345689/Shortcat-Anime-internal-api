.class public final synthetic Lz1/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz1/k$e;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lz1/k$e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz1/m;->a:Lz1/k$e;

    .line 5
    .line 6
    iput p2, p0, Lz1/m;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz1/m;->a:Lz1/k$e;

    .line 2
    .line 3
    iget v1, p0, Lz1/m;->b:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz1/k$e;->b(Lz1/k$e;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
