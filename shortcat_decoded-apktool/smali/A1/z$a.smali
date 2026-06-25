.class LA1/z$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA1/z$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA1/z;->h([LH1/j$b;I)LH1/j$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LA1/z;


# direct methods
.method constructor <init>(LA1/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA1/z$a;->a:LA1/z;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LH1/j$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA1/z$a;->d(LH1/j$b;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LH1/j$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA1/z$a;->c(LH1/j$b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(LH1/j$b;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, LH1/j$b;->g()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public d(LH1/j$b;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, LH1/j$b;->h()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
