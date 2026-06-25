.class public LM6/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM6/d;


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LM6/h;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createImageTranscoder(Lq6/c;Z)LM6/c;
    .locals 1

    .line 1
    new-instance p1, LM6/g;

    .line 2
    .line 3
    iget v0, p0, LM6/h;->a:I

    .line 4
    .line 5
    invoke-direct {p1, p2, v0}, LM6/g;-><init>(ZI)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
