.class public final Lk0/y;
.super Lk0/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:LY/H1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/H1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/y;->b:LY/H1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(LY/b;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/y;->b:LY/H1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY/H1;->C(LY/b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, LY/H1;->f0(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public g(LY/b;)LY/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/y;->b:LY/H1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY/H1;->C(LY/b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, LY/H1;->b1(I)LY/h0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
