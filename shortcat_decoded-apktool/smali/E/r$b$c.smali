.class public final LE/r$b$c;
.super LE/y;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/r$b;->a(LF/u;J)LE/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Z

.field final synthetic h:LE/E;


# direct methods
.method constructor <init>(ZLE/E;IILE/r$b$b;LE/H;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LE/r$b$c;->g:Z

    .line 2
    .line 3
    iput-object p2, p0, LE/r$b$c;->h:LE/E;

    .line 4
    .line 5
    invoke-direct/range {p0 .. p6}, LE/y;-><init>(ZLE/E;IILE/w;LE/H;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(I[LE/v;Ljava/util/List;I)LE/x;
    .locals 7

    .line 1
    new-instance v0, LE/x;

    .line 2
    .line 3
    iget-object v3, p0, LE/r$b$c;->h:LE/E;

    .line 4
    .line 5
    iget-boolean v5, p0, LE/r$b$c;->g:Z

    .line 6
    .line 7
    move v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v4, p3

    .line 10
    move v6, p4

    .line 11
    invoke-direct/range {v0 .. v6}, LE/x;-><init>(I[LE/v;LE/E;Ljava/util/List;ZI)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
