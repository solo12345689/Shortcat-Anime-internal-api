.class LHg/i$b;
.super Ljava/lang/Object;

# interfaces
.implements LFg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:LFg/d;


# direct methods
.method public constructor <init>(IILjava/lang/String;LFg/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LHg/i$b;->a:I

    .line 5
    .line 6
    iput p2, p0, LHg/i$b;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LHg/i$b;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, LHg/i$b;->d:LFg/d;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LHg/i$b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
