.class public final synthetic LE3/N4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/M4$b;

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:LE3/h3$g;


# direct methods
.method public synthetic constructor <init>(LE3/M4$b;ILjava/util/List;LE3/h3$g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/N4;->a:LE3/M4$b;

    .line 5
    .line 6
    iput p2, p0, LE3/N4;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LE3/N4;->c:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, LE3/N4;->d:LE3/h3$g;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/N4;->a:LE3/M4$b;

    .line 2
    .line 3
    iget v1, p0, LE3/N4;->b:I

    .line 4
    .line 5
    iget-object v2, p0, LE3/N4;->c:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, LE3/N4;->d:LE3/h3$g;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LE3/M4$b;->b(LE3/M4$b;ILjava/util/List;LE3/h3$g;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
