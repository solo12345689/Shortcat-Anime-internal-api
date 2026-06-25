.class public final synthetic Lx6/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls5/j;


# instance fields
.field public final synthetic a:LE6/k;

.field public final synthetic b:Lx6/j;


# direct methods
.method public synthetic constructor <init>(LE6/k;Lx6/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx6/i;->a:LE6/k;

    .line 5
    .line 6
    iput-object p2, p0, Lx6/i;->b:Lx6/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx6/i;->a:LE6/k;

    .line 2
    .line 3
    iget-object v1, p0, Lx6/i;->b:Lx6/j;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lx6/j;->a(LE6/k;Lx6/j;Ljava/io/OutputStream;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
