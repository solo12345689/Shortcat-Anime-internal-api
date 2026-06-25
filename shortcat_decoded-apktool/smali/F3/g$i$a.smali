.class LF3/g$i$a;
.super LF3/g$l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/g$i;->h(Ljava/lang/String;LF3/g$m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:LF3/g$m;

.field final synthetic g:LF3/g$i;


# direct methods
.method constructor <init>(LF3/g$i;Ljava/lang/Object;LF3/g$m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$i$a;->g:LF3/g$i;

    .line 2
    .line 3
    iput-object p3, p0, LF3/g$i$a;->f:LF3/g$m;

    .line 4
    .line 5
    invoke-direct {p0, p2}, LF3/g$l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method bridge synthetic d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LF3/e$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LF3/g$i$a;->h(LF3/e$h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method h(LF3/e$h;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LF3/g$i$a;->f:LF3/g$m;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, LF3/g$m;->b(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1, v0, v1}, LF3/e$h;->writeToParcel(Landroid/os/Parcel;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LF3/g$i$a;->f:LF3/g$m;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, LF3/g$m;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
