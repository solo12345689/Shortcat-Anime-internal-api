.class final Ls3/e$c;
.super Lr3/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private g:Lz2/g$a;


# direct methods
.method public constructor <init>(Lz2/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr3/p;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls3/e$c;->g:Lz2/g$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls3/e$c;->g:Lz2/g$a;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lz2/g$a;->a(Lz2/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
