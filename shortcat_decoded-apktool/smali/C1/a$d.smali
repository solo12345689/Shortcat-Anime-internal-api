.class public final LC1/a$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:LC1/a$e;


# direct methods
.method public constructor <init>(LC1/a$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC1/a$d;->a:LC1/a$e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()LC1/a$e;
    .locals 1

    .line 1
    iget-object v0, p0, LC1/a$d;->a:LC1/a$e;

    .line 2
    .line 3
    return-object v0
.end method
